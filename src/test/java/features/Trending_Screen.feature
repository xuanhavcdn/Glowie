Feature: Trending screen

  @Android
  Scenario Outline: Default screen when there is no post
    When I click login with other account
    And I input username as "<username>"
    And I input password as "<password>"
    And I click login button
    And I click filter button
    And I select contest "<contestname>" to view Trending
    Then Default Trending screen with no post is displayed success
    Examples:
      | username   | password | contestname              |
      | 0988903111 | test1234 | Automation Trending Test |

  @Android
  Scenario Outline: Upload the post to contest success
    When I click login with other account
    And I input username as "<username>"
    And I input password as "<password>"
    And I click login button
    And I click filter button
    And I select contest "<contestname>" to view Trending
    And Default Trending screen with no post is displayed success
    Examples:
      | username   | password | contestname              |
      | 0988903111 | test1234 | Automation Trending Test |