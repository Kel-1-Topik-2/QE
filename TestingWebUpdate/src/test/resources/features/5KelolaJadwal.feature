#@KelolaJadwal
#Feature: Kelola jadwal - admin
##
#  @ViewKelolaJadwal
#   Scenario Outline: As a admin i want to View Manage Schedule
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    When I click button login
#    And Login validation invalid
#    Then Click button manage schedule
#    And View manage schedule
#    Examples:
#      |   email   |password   |
#      |admin      |admin123   |

#    @SearchKelolaJadwal
#    Scenario Outline: As a admin i want to search archive
#      Given Open login page
#      And I input "<email>" login email valid
#      And I input "<password>" login password valid
#      When I click button login
#      And Login validation invalid
#      And Click button manage schedule
#      And Click search all category manage schedule
#      Then Click chose nama pasien
#      And Input data "<namacategory>" category
#      And Valid data category archive
#      Examples:
#        |   email   |password   |namacategory|
#        |   admin   |admin123   |    bagas   |
#        |   admin   |admin123   |  &%^%^*)%  |

#  @AddKelolaJadwalRawatJalan
#  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Jalan
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button manage schedule
#    And Click button tambah data
#    And Click on the select patient action to select a patient
#    And Click on the action choose a doctor to choose a doctor
#    Then Choose a date "<tanggal>"
#    And Choose the type of treatment
#    And Click rawat jalan
#    And Click simpan
#    And Validate data kelola jadwal
#    Examples:
#      |   email   |password   | tanggal|
#      |admin      |admin123   | 21122022|
#
#  @AddKelolaJadwalRawatBiasa
#  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button manage schedule
#    And Click button tambah data
#    And Click on the select patient action to select a patient
#    And Click on the action choose a doctor to choose a doctor
#    Then Choose a date "<tanggal>"
#    And Choose the type of treatment
#    And Click rawat biasa
#    And Click simpan
#    And Validate data kelola jadwal
#    Examples:
#      |   email   |password   | tanggal|
#      |admin      |admin123   | 13112022|
#
#  @AddKelolaJadwalRawatBiasaNoTanggal
#  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada tanggal
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button manage schedule
#    And Click button tambah data
#    And Click on the select patient action to select a patient
#    And Click on the action choose a doctor to choose a doctor
#    Then Choose a date "<tanggal>"
#    And Choose the type of treatment
#    And Click rawat biasa
#    And Click simpan
#    And Validate data error kelola jadwal
#    Examples:
#      |   email   |password   | tanggal|
#      |admin      |admin123   | |
#
#  @AddKelolaJadwalRawatJalanNoPerawat
#  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada perawat
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button manage schedule
#    And Click button tambah data
#    And Click on the select patient action to select a patient
#    And Click on the action choose a doctor to choose a doctor
#    Then Choose a date "<tanggal>"
#    And Choose the type of treatment
#    And Click simpan
#    And Validate data error kelola jadwal
#    Examples:
#      |   email   |password   | tanggal|
#      |admin      |admin123   | 13112022 |
#
#  @AddKelolaJadwalRawatJalanNoAll
#  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada perawat & tanggal
#    Given Open login page
#    And I input "<email>" login email valid
#    And I input "<password>" login password valid
#    And I click button login
#    And Login validation invalid
#    When Click button manage schedule
#    And Click button tambah data
#    And Click on the select patient action to select a patient
#    And Click on the action choose a doctor to choose a doctor
#    Then Choose a date "<tanggal>"
#    And Choose the type of treatment
#    And Click simpan
#    And Validate data error kelola jadwal
#    Examples:
#      |   email   |password   | tanggal|
#      |admin      |admin123   |  |