@AddKelolaJadwal
Feature: Add Kelola Jadwal - Admin

  @AddKelolaJadwalRawatJalan
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Jalan [Positive]
    Given Open page Kelola Jadwal
    When Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat jalan
    And Click simpan
    And Validate data kelola jadwal
    Examples:
      | tanggal|
      |11102022|

  @AddKelolaJadwalRawatBiasa
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa [Positive]
    Given Open page Kelola Jadwal
    When Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat biasa
    And Click simpan
    And Validate data kelola jadwal
    Examples:
      | tanggal|
      |13112022|

  @AddKelolaJadwalRawatJalanKosongTanggal
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Jalan - KosongTanggal [Negative]
    Given Open page Kelola Jadwal
    When Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Choose the type of treatment
    And Click rawat jalan
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      | tanggal|
      ||

  @AddKelolaJadwalRawatBiasaNoPerawat
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - Tidak memilih Perawat [Negative]
    Given Open page Kelola Jadwal
    When Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      | tanggal|
      |13112022|

  @AddKelolaJadwalRawatBiasaNoALL
  Scenario Outline: As a admin i want to Add Manage Schedule Rawat Biasa - Tanpa tanggal dan perawat [Negative]
    Given Open page Kelola Jadwal
    When Click button tambah data
    And Click on the select patient action to select a patient
    And Click on the action choose a doctor to choose a doctor
    Then Choose a date "<tanggal>"
    And Click simpan
    And Validate data error kelola jadwal
    Examples:
      | tanggal|
      ||

