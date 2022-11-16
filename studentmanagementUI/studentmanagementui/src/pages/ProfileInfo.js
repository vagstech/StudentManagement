import React, { Component } from 'react'
import axios from "axios";

import { makeStyles } from "@material-ui/core/styles";
import { useEffect, useState } from 'react';
import Paper from "@material-ui/core/Paper";
import PeopleAltIcon from "@material-ui/icons/PeopleAlt";
import Avatar from "@material-ui/core/Avatar";
import './profileInfo.css';




const useStyles = makeStyles((theme) => ({
    root: {
        "& > *": {
            margin: theme.spacing(1),
            width: theme.spacing(180),
            height: theme.spacing(30)
        }
    },

    customBorderRadius: {
        borderRadius: 20
    }
}));


export default function ProfileInfo() {
    const classes = useStyles();
    const [data, setData] = useState({
        firstName: "",
        lastName: "",
        age: 0,
        email: ""
    });

    useEffect(() => {
        function renderStudentData() {
            axios.get('http://localhost:8081/student/getStudent/10')
                .then(response => {
                    setData(response.data);
                })
                .catch(error => {
                    console.error('There was an error!', error);
                });
        }
        renderStudentData();
    }, []);


    return (
        <>
            <div className={classes.root}>
                <Paper className={classes.customBorder}>
                    <Avatar className={classes.avatar}>
                        <PeopleAltIcon className={classes.icon} />
                    </Avatar>
                </Paper>
                <Paper className={classes.customBorder}>
                    <div>
                        <table>
                            <tbody>
                                <tr>
                                    <td>
                                        First Name :
                                    </td>
                                    <td>
                                        {data.firstName}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Last Name :
                                    </td>
                                    <td>
                                        {data.lastName}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Age :
                                    </td>
                                    <td>
                                        {data.age}
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Email :
                                    </td>
                                    <td>
                                        {data.email}
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </Paper>


            </div>


        </>
    )

}