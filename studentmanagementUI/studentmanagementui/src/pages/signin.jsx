import './index.css';
import Footer from './footer';
import React, { Component } from "react";
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
import axios from "axios";
class SignIn extends Component {
  state = {
    email: "",
    password: "",
    hidePassword: true,
    error: null,
    errorOpen: true
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

    const newUserCredentials = {
      username: this.state.email,
      password: this.state.password,
      role : "student"
      
    };
    console.log("this.props.newUserCredentials", newUserCredentials);

    axios.post('http://localhost:8081/login', newUserCredentials)
        .then(response => {
          console.log("response-->"+response.data)
             
        })
        .catch(error => {
           // this.setState({ errorMessage: error.message });
            console.error('There was an error!', error);
        });
    
  };

  render() {
    const { classes } = this.props;
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


              <Button
                disabled={!this.isValid()}
                disableRipple
                fullWidth
                variant="outlined"
                className={classes.button}
                type="submit"
                onClick={this.submitRegistration}
              >
                Login
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

export default withStyles(register)(SignIn);