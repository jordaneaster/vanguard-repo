export default function AssessmentPage() {
    return `
          <div class="user_tile">
          <p class="userName">Welcome</p>
         
          </div>
          <select name="cbtMood" id="assessMood" class="intake">
          <option value="userMood" class="cbt1">I feel..</option>
          <option value="Lonely" class="cbt2">Lonely</option>
          <option value="Sad" class="cbt3">Sad</option>
          <option value="Depressed" class="cbt4">Depressed</option>
          <option value="Hopeless" class="cbt5">Hopeless</option>
          <option value="Suicidal" class="cbt6">Suicidal</option>
          <option value="Violent" class="cbt7">Violent</option>
          <option value="Exhausted" class="cbt8">Exhausted</option>
          <option value="Misunderstood" class="cbt9">Misunderstood</option>
        </select>
        <select name="cbtTrigger" id="assessTrigger" class="intake">
          <option value="userTrigger" class="cbt">Beause of...</option>
          <option value="userTrigger" class="cbt">Financial Issues</option>
          <option value="userTrigger" class="cbt">Realtionship Issues</option>
          <option value="userTrigger" class="cbt">Occupational Stress</option>
          <option value="userTrigger" class="cbt">Parental Stress</option>
          <option value="userTrigger" class="cbt">Gun Violence</option>
          <option value="userTrigger" class="cbt">Domestic Violence</option>
          <option value="userTrigger" class="cbt">Bullying</option>
        </select>
        <select name="userCoping" id="assessCoping" class="cbt">
          <option value="userCoping" class="cbt">
            Which makes me want to...
          </option>
          <option value="userCoping" class="cbt">Do Drugs</option>
          <option value="userCoping" class="cbt">Consume Alcohol</option>
          <option value="userCoping" class="cbt">Commit Violence</option>
          <option value="userCoping" class="cbt">Commit Suicide</option>
          <option value="userCoping" class="cbt">Isolate</option>
          <option value="userCoping" class="cbt">Eating/Starve</option>
          <option value="userCoping" class="cbt">File for Divorce</option>
        </select>
        <button class="assessBtn">Get Help</button>
        </div>
            `;
  }

