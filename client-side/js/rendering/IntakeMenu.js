import apiActions from "../api-actions/api-actions";
import userWelcome from "../pages/UserProfilePage";
import UserMood from "./UserMood";
export default class IntakeMenu {
  constructor(
    lonely,
    sad,
    depressed,
    hopeless,
    suicidal,
    violent,
    exhausted,
    misunderstood
  ) {
    this.lonely = lonely;
    this.sad = sad;
    this.depressed = depressed;
    this.hopeless = hopeless;
    this.suicidal = suicidal;
    this.violent = violent;
    this.exhausted = exhausted;
    this.misunderstood = misunderstood;
  }

  getLonely() {
    return apiActions.getRequest("http://localhost:8080/mood/10", (mood) => {
      UserMood(mood);
    });
  }
  getSad() {
    return apiActions.getRequest("http://localhost:8080/mood/11", (mood) => {
      UserMood(mood);
    });
  }
  getDepressed() {
    return apiActions.getRequest("http://localhost:8080/mood/12", (mood) => {
      UserMood(mood);
    });
  }
  getHopeless() {
    return apiActions.getRequest("http://localhost:8080/mood/13", (mood) => {
      UserMood(mood);
    });
  }
  getSuicidal() {
    return apiActions.getRequest("http://localhost:8080/mood/14", (mood) => {
      UserMood(mood);
    });
  }
  getViolent() {
    return apiActions.getRequest("http://localhost:8080/mood/15", (mood) => {
      UserMood(mood);
    });
  }
  getExhausted() {
    return apiActions.getRequest("http://localhost:8080/mood/16", (mood) => {
      UserMood(mood);
    });
  }
  getMisunderstood() {
    return apiActions.getRequest("http://localhost:8080/mood/17", (mood) => {
      UserMood(mood);
    });
  }
}
