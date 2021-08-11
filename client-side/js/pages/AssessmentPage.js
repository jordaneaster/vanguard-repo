export default function AssessmentPage() {
  return `
        <div class="assessmentMenu">
        <select name="cbtMood" id="assessMood" class="intakeMood">
          <option value="userMood" class="cbt1">I feel..</option>
          <option value="Afraid" class="cbt2">Afraid</option>
          <option value="Anxious" class="cbt3">Anxious</option>
          <option value="Sad" class="cbt4">Sad</option>
          <option value="Lonely" class="cbt5">Lonely</option>
          <option value="Depressed" class="cbt6">Depressed</option>
          <option value="Hopeless" class="cbt7">Hopeless</option>
          <option value="Suicidal" class="cbt8">Suicidal</option>
          <option value="Violent" class="cbt9">Violent</option>
          <option value="Exhausted" class="cbt9">Exhausted</option>        
        </select>

      <select name="cbtTrigger" id="assessTrigger" class="intakeTrigger">
        <option value="userTrigger" class="cbt10">Beause of...</option>
        <option value="Financial Issues" class="cbt11">Financial Issues</option>
        <option value="Relationship Issues" class="cbt12">Relationship Issues</option>
        <option value="Occupational Stress" class="cbt13">Occupational Stress</option>
        <option value="Parental Stress" class="cbt14">Parental Stress</option>
        <option value="Gun Violence" class="cbt15">Gun Violence</option>
        <option value="Domestic Violence" class="cbt16">Domestic Violence</option>
        <option value="Bullying" class="cbt17">Bullying</option>
      </select>

      <select name="userCoping" id="assessCoping" class="intakeCoping">
        <option value="userCoping" class="cbt">
          Which makes me want to...</option>
        <option value="Abuse Drugs" class="cbt">Abuse Drugs</option>
        <option value="Consume Alcohol" class="cbt">Consume Alcohol</option>
        <option value="Commit Violence" class="cbt">Commit Violence</option>
        <option value="Self-Harm" class="cbt">Self-Harm</option>
        <option value="Isolate" class="cbt">Isolate</option>
        <option value="Eat/Starve" class="cbt">Eat/Starve</option>
        <option value="File for Divorce" class="cbt">File for Divorce</option>
      </select>
      <button class="assessBtn">Get Help</button>
      </div>
          `;
}
