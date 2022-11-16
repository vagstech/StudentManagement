import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./NAV";
import Home from './pages';
import SignUp from './pages/signup';
import SignIn from './pages/signin';
import StudentHome from './pages/studenthome';
import SideBar from './SideBar/SideBar';
import Student from './pages/Student'

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/signin" element={<SignIn />} />
        <Route path="/sign-up" element={<SignUp />} />
        <Route path="/studentHome" element={<StudentHome />} />
        <Route path="/sidebar" element={<Student />} />
        
      </Routes>
    </BrowserRouter>
  );
}

export default App;
