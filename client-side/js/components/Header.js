import "../../css/header_footer.css";
import HRHeart from '../../images/hr-logo-heart.png'

export default function Header() {
  return `
  <nav>
  <img class="logoHeart" src="${HRHeart}" alt="" />
  	<input type="checkbox">
	<label>&equiv;</label>
        <ul>  
            <li class='nav__list_loginDraft'>Login Draft</li>
            <li class='nav__list_home'>Home</li>
            <li class='nav__list_profile'>Profile</li>
            <li class='nav__list_moods'>Moods</li>
            <li class='nav__list_triggers'>Triggers</li>
            <li class='nav__list_coping_mechanisms'>Coping Mechanisms</li>
            <li class='nav__list_consequences'>Consequences</li>
            <li class='nav__list_results'>Results</li>
            <li class='nav__list_alternatives'>Alternatives</li>
            <li class='nav__list_responses'>Responses</li>
            <li class='nav__list_reviews'>Reviews</li>
            <li class='nav__list_appointment'>Appointment</li>

        </ul>
    </nav>
        `;
}
