import './index.css';
import Footer from './footer';
import AliceCarousel from 'react-alice-carousel';
import "react-alice-carousel/lib/alice-carousel.css";
import image1 from '../images/School1.jpg';
import image2 from '../images/School2.jpg';
import image3 from '../images/School3.jpg';
const Home = () => {
    return (  
        <div>  
          <AliceCarousel autoPlay  autoPlayInterval="3000">
            <img src={image1} className="sliderimg"/>
            <img src={image2} className="sliderimg"/>
            <img src={image3} className="sliderimg"/>
            </AliceCarousel>
            <Footer/>
      </div>
    );
  };
  
  export default Home;