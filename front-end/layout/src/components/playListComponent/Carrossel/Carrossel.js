import './Carrossel.css';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import { Carousel } from 'reactstrap';

export default class Carrossel extends React.Component {
	constructor(props) {
	  super(props);
  
	  this.toggle = this.toggle.bind(this);
	  this.state = {
		isOpen: false
	  };
	}
	toggle() {
	  this.setState({
		isOpen: !this.state.isOpen
	  });
	}
    render(){
        return(
            <div class= "CarouselGeral">
                <Carousel >
                    <Carousel.Item >
                        <img classname=" d-block w-100"
                            src="https://i.postimg.cc/tgF9qYkG/image1-4.png"
                            alt="Image One"
                        />
                        <Carousel.Caption>
                            Mais tocadas
                        </Carousel.Caption>
                    </Carousel.Item>
                    <Carousel.Item>
                        <img classname=" d-block w-100"
                            src="https://i.postimg.cc/tgF9qYkG/image1-4.png"
                            alt="Image Two"
                        />
                        <Carousel.Caption>
                            Mais tocadas
                        </Carousel.Caption>
                    </Carousel.Item>
                </Carousel>
            </div>


        );

    }

}