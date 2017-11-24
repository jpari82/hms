#!/bin/bash

set -ex

pushd hms
  echo "Running Tests"
  ./gradlew test
popd

exit 0