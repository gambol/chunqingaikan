.class Lnet/youmi/android/a/a/g/e/j;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/e/j;->b:Ljava/lang/String;

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 7

    const/16 v6, 0x200

    const/16 v5, 0x26

    new-instance v1, Lnet/youmi/android/a/c/c/b;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-direct {v1, v0}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x4

    invoke-static {v0}, Lnet/youmi/android/a/b/d/b;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lnet/youmi/android/a/a/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "?s="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "00000"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4, v6}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const-string v0, "9"

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_0
    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    :goto_0
    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_9

    :goto_1
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_1
    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_8

    :goto_2
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_2
    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_7

    :goto_3
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_3
    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_6

    :goto_4
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_4
    invoke-virtual {v1}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_5

    :goto_5
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_5
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_4

    :goto_6
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_6
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3

    :goto_7
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_7
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/h/e;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2

    :goto_8
    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_8
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->b:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/j;->b:Ljava/lang/String;

    invoke-static {v0, v4}, Lnet/youmi/android/a/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1

    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ef45N92f053P36cd"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_9
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const v3, 0xc5939

    invoke-static {v1, v0, v3}, Lnet/youmi/android/a/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0

    :goto_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :try_start_a
    const-string v0, "0"
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_9

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v0

    goto :goto_7

    :catch_4
    move-exception v0

    goto :goto_6

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v0

    goto/16 :goto_4

    :catch_7
    move-exception v0

    goto/16 :goto_3

    :catch_8
    move-exception v0

    goto/16 :goto_2

    :catch_9
    move-exception v0

    goto/16 :goto_1
.end method


# virtual methods
.method a()V
    .locals 3

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v0}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const-string v1, "a_sdk_prt_5"

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    invoke-static {}, Lnet/youmi/android/a/c/b;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/e/j;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/g/e/j;->a:Landroid/content/Context;

    invoke-static {v2, v1, v0}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
