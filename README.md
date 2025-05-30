# Kotlin - Room Database

## Table of contents

- [Requirement](#requirement)
- [Architecture](#architecture)
- [Note](#note)
- [Resources](#resources)

## Requirement

- Device or an emulator with API level `26` or higher.

## Architecture

- Store data in `memory`.
  - View <-> ViewModel <-> Manager
- Store data in `storage (database)`.
  - View <-> ViewModel <-> DAO <-> RoomDB
    - <img src="./images/room_architecture.png" width="60%" alt="Room Architecture">

## Note

- Room
  - Room is a persistence library that's part of Android Jetpack.
  - Room is an abstraction layer on top of a SQLite database.
  - Three major components:
    - Database class
    - Data entities
    - Data access objects (DAOs)
- Kotlin Symbol Processing (KSP)
  - KSP is an API that you can use to develop lightweight compiler plugins.
  - Compared to kapt, annotation processors that use KSP can run up to two times faster.

## Resources

- [Room Database 🛢 in Android | Android Tutorial | 2024](https://www.youtube.com/watch?v=sWOmlDvz_3U&list=PLgpnJydBcnPA5aNrlDxxKWSqAma7m3OIl&index=8&ab_channel=EasyTuto)
- [Save data in a local database using Room](https://developer.android.com/training/data-storage/room)
- [androidx.room](https://developer.android.com/jetpack/androidx/releases/room)
- [Kotlin Symbol Processing API](https://kotlinlang.org/docs/ksp-overview.html)
