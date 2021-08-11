
import '../../css/login.css'
import LoginLogo from '../../images/hr-logo-login.png'
import BackgroundLogo from '../../images/login.jpg'

export default function LoginDraft() {
    return `
    <div class="container">
    <img class="loginLogo" src="${BackgroundLogo}" alt="healthy response logo"/>
     <img class="loginLogo" src="${LoginLogo}" alt="healthy response logo"/>
     </div>

     <div class="userNameLogin">
      <input type="text" id="userNameLogin" class="userName" name="username" placeholder="USERNAME">
      <input type="text" id="userPasswordLogin" class="password" name="password" placeholder="PASSWORD">
      <button class="loginButton" type="submit" value="LOGIN"></button>
      <p class="loginTOS">TERMS OF SERVICE</p>
      </div>
   
      `;
  }

