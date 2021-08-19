import HRFooterLogo from "../../images/vhs-logo-black.png"

export default function Footer() {
  return `

  <ul class="footer_nav">
  <img src="${HRFooterLogo}">
      <li class='footer_list_aboutUs'>About Us</li>
      <li class='footer_list_contactUs'>Contact Us</li>
      <li class='footer_list_reviews'>Reviews</li>
      <li class='footer_list_legal'>Legal</li>
  </ul>
<small>&copy VanGUARD Health Solutions 2021</small>
    `;
}