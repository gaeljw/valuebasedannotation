# valuebasedannotation

## Java 17 ✅

```shell
sbt clean compile

✅
```

## Java 21 and target 17 💥

```shell
sbt clean compile

[error] .../MyFile.scala:6:8: Class jdk.internal.ValueBased+Annotation not found - continuing with a stub.
[error] import java.time.LocalDateTime
[error]        ^
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
```

## Java 21 and target 17 but commenting out `TapirCodecEnumeratum` ✅

```diff
- object MyFile extends TapirCodecEnumeratum {
+ object MyFile /*extends TapirCodecEnumeratum*/ {
```

```shell
sbt clean compile
```


## Java 21 and target 21 ✅

Change `build.sbt`:
```diff
- scalacOptions += "-release:17"
+ scalacOptions += "-release:21"
```

```shell
sbt clean compile

✅
```

