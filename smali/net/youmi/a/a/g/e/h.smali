.class Lnet/youmi/android/a/a/g/e/h;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lorg/json/JSONObject;

.field private d:I

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/e/h;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->b:Ljava/lang/String;

    iput p3, p0, Lnet/youmi/android/a/a/g/e/h;->d:I

    invoke-direct {p0, p2, p3}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;
    .locals 1

    new-instance v0, Lnet/youmi/android/a/a/g/e/i;

    invoke-direct {v0, p0, p2, p1}, Lnet/youmi/android/a/a/g/e/i;-><init>(Lnet/youmi/android/a/a/g/e/h;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Ljava/lang/String;I)V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    new-instance v1, Lnet/youmi/android/a/c/c/b;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-direct {v1, v0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v3, "ie"

    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    :goto_0
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v2, "ei"

    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v2, "si"

    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v2, "bd"

    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "andid"

    iget-object v2, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "mac"

    iget-object v2, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "sv"

    const-string v2, "w%s,s%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "500"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "500"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "lv"

    const-string v2, "2014120501"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "aat"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    const-string v1, "pns"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    :goto_1
    return-void

    :cond_1
    const-string v0, "0"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private b()Ljava/util/HashMap;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "rt"

    iget-object v2, p0, Lnet/youmi/android/a/a/g/e/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/e/h;->b()Ljava/util/HashMap;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, ""

    :goto_1
    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1
.end method


# virtual methods
.method a()V
    .locals 8

    const/4 v5, 0x2

    const/4 v7, 0x1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/v1/android/packages"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/e/h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/h;->c:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/l;->a([B)[B

    move-result-object v1

    sget-object v2, Lnet/youmi/android/a/a/g/e/h;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/d/k;->a([B[B)[B

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x200

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {}, Lnet/youmi/android/a/a/c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "?rt="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lnet/youmi/android/a/a/g/e/h;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&sign="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v2}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    iget v3, p0, Lnet/youmi/android/a/a/g/e/h;->d:I

    if-ne v3, v7, :cond_3

    const-string v3, "a_sdk_prt_i"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    :cond_2
    :goto_1
    invoke-static {}, Lnet/youmi/android/a/c/b;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    const/4 v3, 0x5

    new-array v3, v3, [Lorg/apache/http/Header;

    const/4 v4, 0x0

    const-string v5, "X-YM-APP"

    iget-object v6, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v6}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "Content-Type"

    const-string v6, "application/octet-stream"

    invoke-direct {p0, v5, v6}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-string v5, "X-YM-SESSION"

    iget-object v6, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v6}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "X-YM-SESSION"

    iget-object v6, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v6}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x4

    const-string v5, "X-YM-Encoding"

    const-string v6, "deflate,enc4"

    invoke-direct {p0, v5, v6}, Lnet/youmi/android/a/a/g/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v5

    aput-object v5, v3, v4

    iget-object v4, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v4, v0, v1, v3, v2}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;[B[Lorg/apache/http/Header;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "c"

    const/4 v2, -0x1

    invoke-static {v1, v0, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v7, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/h;->e:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;)V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_3
    iget v3, p0, Lnet/youmi/android/a/a/g/e/h;->d:I

    if-ne v3, v5, :cond_2

    const-string v3, "a_sdk_prt_u"

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method
