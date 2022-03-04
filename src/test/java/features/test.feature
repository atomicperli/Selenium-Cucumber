Feature: Advanced Configurations Feature


  #Steps
  #1. Clicks on Advanced Configuration Section and Verifies Basic fields Like Location Dropdown, Browser and Start Test Button are displayed or not
  #2. Clicks on Test Settings Tab and Verify 'First View Only' CheckBox is Selected or not
  #3. Click on Advanced Tab and Check if 9 Checkboxes are Present or Not
  #4. Click on Chromium Tab and Check if Motorola Mobile is selected in the Mobile Device Dropdown
  #5. Click on Script Tab and Check if 2 Checkboxes are Present or Not
  #6. Click on Block Tab and Check if Block Requests Text Area is Present or Not
  #7. Click on SPOF Tab and Check if Hosts to Fail Text Area is Present or Not
  #8. Click on Custom Tab and Check if Custom Metrics Text Area is Present or Not

  @firsttest
  Scenario: Verify The Fields in the Advanced Configurations Sections
    Given user is on homepage
    When user Clicks on "Advanced Configuration" Section
    Then Verify Basic Fields on "Advanced Configurations" Section
    When user Clicks on "Test Settings" Tab
    Then Verify Basic Fields on "Test Settings" Tab
    When user Clicks on "Advanced" Tab
    Then Verify Basic Fields on "Advanced" Tab
    When user Clicks on "Chromium" Tab
    Then Verify Basic Fields on "Chromium" Tab
    When user Clicks on "Script" Tab
    Then Verify Basic Fields on "Script" Tab
    When user Clicks on "Block" Tab
    Then Verify Basic Fields on "Block" Tab
    When user Clicks on "SPOF" Tab
    Then Verify Basic Fields on "SPOF" Tab
    When user Clicks on "Custom" Tab
    Then Verify Basic Fields on "Custom" Tab