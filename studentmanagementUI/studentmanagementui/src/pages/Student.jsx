import React from 'react';
import StudentHome from './studenthome';
import Signin from './signin';
import SideBar from '../SideBar/SideBar';
export default function Student() {
  return (
    <div>
      <div className='float:left'>
        <SideBar/>
      </div>
      <div >
        <StudentHome/>
      </div>
      
    </div>
  );
}