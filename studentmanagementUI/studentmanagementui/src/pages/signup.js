import './index.css';
import Footer from './footer';
import React, { Component, useState } from "react";
import { withStyles } from "@material-ui/core/styles";
import { register } from "./signinstyle";
import InputAdornment from "@material-ui/core/InputAdornment";

import CssBaseline from "@material-ui/core/CssBaseline";
import Paper from "@material-ui/core/Paper";
import Avatar from "@material-ui/core/Avatar";
import { FormControl, Input, InputLabel, Button } from "@material-ui/core";
import PeopleAltIcon from "@material-ui/icons/PeopleAlt";
import Snackbar from "@material-ui/core/Snackbar";
import SnackbarContent from "@material-ui/core/SnackbarContent";
import IconButton from "@material-ui/core/IconButton";
import ErrorIcon from "@material-ui/icons/Error";
import VisibilityTwoToneIcon from "@material-ui/icons/VisibilityTwoTone";
import VisibilityOffTwoToneIcon from "@material-ui/icons/VisibilityOffTwoTone";
import CloseIcon from "@material-ui/icons/Close";
import "react-datepicker/dist/react-datepicker.css";
import axios from "axios";
import { Navigate } from 'react-router-dom';

class SignUp extends Component {


  state = {
    firstName:"",
    lastName:"",
    age:"",
    dob:"",
    email: "",
    password: "",
    passwordConfrim: "",
    hidePassword: true,
    error: null,
    errorOpen: false,
    isRegister:false
  };

  errorClose = e => {
    this.setState({
      errorOpen: false
    });
  };

  handleChange = name => e => {
    this.setState({
      [name]: e.target.value
    });
  };

  passwordMatch = () => this.state.password === this.state.passwordConfrim;

  showPassword = () => {
    this.setState(prevState => ({ hidePassword: !prevState.hidePassword }));
  };

  isValid = () => {
    if (this.state.email === "") {
      return false;
    }
    return true;
  };
  submitRegistration = e => {
    e.preventDefault();
    if (!this.passwordMatch()) {
      this.setState({
        errorOpen: true,
        error: "Passwords don't match"
      });
    }
    const newUserCredentials = {
      firstName:this.state.firstName,
      lastName :this.state.lastName,
      age:this.state.age,
      email: this.state.email,
      pwd: this.state.password
    };
    console.log("this.props.newUserCredentials", newUserCredentials);
    axios.post('http://localhost:8081/student/create', newUserCredentials)
        .then(response => {
          console.log("response-->"+response.data.studentId)
           if(response.data.studentId!=null){
              this.state.isRegister = true;
           }     
        })
        .catch(error => {
            this.setState({ errorMessage: error.message });
            console.error('There was an error!', error);
        });
  };

  render() {
    const { classes } = this.props;
    if(this.state.isRegister) {
      <div>
      {<Navigate to="/" />}
    </div>
     }
    return (
      <div>
        <div className={classes.main}>
          <CssBaseline />

          <Paper className={classes.paper}>
            <Avatar className={classes.avatar}>
              <PeopleAltIcon className={classes.icon} />
            </Avatar>
            <form
              className={classes.form}
              onSubmit={() => this.submitRegistration}
            >
              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="firstname" className={classes.labels}>
                  First Name
                </InputLabel>
                <Input
                  name="firstname"
                  type="text"
                  className={classes.inputs}
                  disableUnderline={true}
                  onChange={this.handleChange("firstName")}
                />
              </FormControl>
              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="laststname" className={classes.labels}>
                  Last Name
                </InputLabel>
                <Input
                  name="lastname"
                  type="text"
                  className={classes.inputs}
                  disableUnderline={true}
                  onChange={this.handleChange("lastName")}
                />
              </FormControl>
              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="age" className={classes.labels}>
                  Age
                </InputLabel>
                <Input
                  name="age"
                  type="age"
                  className={classes.inputs}
                  disableUnderline={true}
                  onChange={this.handleChange("age")}
                />
              </FormControl>
              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="email" className={classes.labels}>
                  e-mail
                </InputLabel>
                <Input
                  name="email"
                  type="email"
                  autoComplete="email"
                  className={classes.inputs}
                  disableUnderline={true}
                  onChange={this.handleChange("email")}
                />
              </FormControl>

              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="password" className={classes.labels}>
                  password
                </InputLabel>
                <Input
                  name="password"
                  autoComplete="password"
                  className={classes.inputs}
                  disableUnderline={true}
                  onChange={this.handleChange("password")}
                  type={this.state.hidePassword ? "password" : "input"}
                  endAdornment={
                    this.state.hidePassword ? (
                      <InputAdornment position="end">
                        <VisibilityOffTwoToneIcon
                          fontSize="default"
                          className={classes.passwordEye}
                          onClick={this.showPassword}
                        />
                      </InputAdornment>
                    ) : (
                      <InputAdornment position="end">
                        <VisibilityTwoToneIcon
                          fontSize="default"
                          className={classes.passwordEye}
                          onClick={this.showPassword}
                        />
                      </InputAdornment>
                    )
                  }
                />
              </FormControl>

              <FormControl required fullWidth margin="normal">
                <InputLabel htmlFor="passwordConfrim" className={classes.labels}>
                  confrim password
                </InputLabel>
                <Input
                  name="passwordConfrim"
                  autoComplete="passwordConfrim"
                  className={classes.inputs}
                  disableUnderline={true}
                  onClick={this.state.showPassword}
                  onChange={this.handleChange("passwordConfrim")}
                  type={this.state.hidePassword ? "password" : "input"}
                  endAdornment={
                    this.state.hidePassword ? (
                      <InputAdornment position="end">
                        <VisibilityOffTwoToneIcon
                          fontSize="default"
                          className={classes.passwordEye}
                          onClick={this.showPassword}
                        />
                      </InputAdornment>
                    ) : (
                      <InputAdornment position="end">
                        <VisibilityTwoToneIcon
                          fontSize="default"
                          className={classes.passwordEye}
                          onClick={this.showPassword}
                        />
                      </InputAdornment>
                    )
                  }
                />
              </FormControl>
              <Button
                disabled={!this.isValid()}
                disableRipple
                fullWidth
                variant="outlined"
                className={classes.button}
                type="submit"
                onClick={this.submitRegistration}
              >
                Join
              </Button>
            </form>

            {this.state.error ? (
              <Snackbar
                variant="error"
                key={this.state.error}
                anchorOrigin={{
                  vertical: "bottom",
                  horizontal: "center"
                }}
                open={this.state.errorOpen}
                onClose={this.errorClose}
                autoHideDuration={3000}
              >
                <SnackbarContent
                  className={classes.error}
                  message={
                    <div>
                      <span style={{ marginRight: "8px" }}>
                        <ErrorIcon fontSize="large" color="error" />
                      </span>
                      <span> {this.state.error} </span>
                    </div>
                  }
                  action={[
                    <IconButton
                      key="close"
                      aria-label="close"
                      onClick={this.errorClose}
                    >
                      <CloseIcon color="error" />
                    </IconButton>
                  ]}
                />
              </Snackbar>
            ) : null}
          </Paper>
        </div>
        <Footer />
      </div>
    );
  }
}

export default withStyles(register)(SignUp);