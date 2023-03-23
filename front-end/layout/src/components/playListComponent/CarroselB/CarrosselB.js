import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import './CarrosselB.css'


export default class CarrosselB extends React.Component {
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
            <figure>
                <img class="carrocelfooterb" src="https://i.postimg.cc/B6qdKGRX/image1-4-1.png" alt="Image One"/>
                <figcaption class="legendab">Nome da Musica</figcaption>
            </figure>

        );

    }
    
}