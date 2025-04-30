require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        script:
        $dialer.setTtsConfig({ Voice: "es-ES-Wavenet-C" });
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