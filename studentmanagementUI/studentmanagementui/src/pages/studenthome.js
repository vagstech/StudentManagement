import './index.css';
import React, { Component } from 'react';
import ProfileInfo from './ProfileInfo';
import SideBar from '../SideBar/SideBar';
export default class StudentHome extends Component {




  render() {
    return (
      <>
        < div className='flex-box'>
          <SideBar />
          <ProfileInfo />
        </div>
      </>
    )
  }
}