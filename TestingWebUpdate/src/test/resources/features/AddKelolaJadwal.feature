@AddKelolaJadwal
Feature: Add Kelola Jadwal - Admin

  @AddKelolaJadwalRawatJalan
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Jalan
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button manage schedule
    And Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat jalan
    And Click simpan
    And Validate data kelola jadwal
    Examples:
      |   email   |password   | tanggal|
      |admin      |admin123   | 21122022|

  @AddKelolaJadwalRawatBiasa
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button manage schedule
    And Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat biasa
    And Click simpan
    And Validate data kelola jadwal
    Examples:
      |   email   |password   | tanggal|
      |admin      |admin123   | 13112022|

  @AddKelolaJadwalRawatBiasaNoTanggal
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada tanggal
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button manage schedule
    And Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat biasa
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      |   email   |password   | tanggal|
      |admin      |admin123   | |

  @AddKelolaJadwalRawatJalanNoPerawat
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada perawat
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button manage schedule
    And Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      |   email   |password   | tanggal|
      |admin      |admin123   | 13112022 |

  @AddKelolaJadwalRawatJalanNoAll
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - tidak ada perawat & tanggal
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    When Click button manage schedule
    And Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      |   email   |password   | tanggal|
      |admin      |admin123   |  |

