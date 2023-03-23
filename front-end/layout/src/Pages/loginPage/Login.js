import React from 'react';
import CompLogin from '../../components/loginComponent/CompLogin';
import HeadersLogin from '../../components/headerComponent/HeadersLogin';


function Login() {
  return (  
    <div>
        <header>
          <HeadersLogin />
        </header> 
        <div>
        <CompLogin />
        </div>
    </div>
  );
}

export default Login;