
import LoginLogo from '../../images/hr-logo-login.png'

export default function LoginDraft() {
    return `
    <div class="container">
     <img class="loginLogo" src="${LoginLogo}" alt="healthy response logo"/>
     <form class="loginFields">
     <div class="userNameLogin">
     <input type="text" id="userNameLogin" name="username" placeholder="USERNAME">
     </div>
      <div class="passwordLogin">
      <input type="text" id="userPasswordLogin" name="password" placeholder="PASSWORD">
      </div>
      <div class="loginButton">
      <input type="submit" value="LOGIN">
      </div>
      <p class="loginTOS">TERMS OF SERVICE</p>
      </div> 
  </form>
    </div>  
  
  
  
  
      `;
  }