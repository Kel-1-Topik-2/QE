#@ArsipJadwal
#Feature: Arsip jadwal - admin
#
#  @ViewArsipJadwal
#   Scenario: As a admin i want to View archive
#    Given Open page dasbord
#    When Click button archive
#    Then View archive
#
#  @SearchArsipJadwal
#  Scenario Outline: As a admin i want to search archive
#    Given Open page archive
#    And Click search all category archive
#    When Click chose nama pasien
#    And Input data "<namacategory>" category
#    Then Valid data category archive
#    Examples:
#      |namacategory|
#      |    bagas   |
#      |  &%^%^*)%  |