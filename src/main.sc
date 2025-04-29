require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        $dialer.setTtsConfig({ VoiceName: "es-MX-BeatrizNeural" });
        a: Empecemos.

    state: Hello
        intent!: /hello
        a: Hola

    state: Bye
        intent!: /bye
        a: Adiós

    state: NoMatch
        event!: noMatch
        a: No entiendo. tu dijiste: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}