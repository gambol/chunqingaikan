.class public final Lnet/youmi/android/a/a/d/a/a;
.super Lnet/youmi/android/a/b/g/c/a;


# direct methods
.method protected constructor <init>(Ljava/io/File;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lnet/youmi/android/a/b/g/c/a;-><init>(Ljava/io/File;JJ)V

    return-void
.end method

.method protected static a(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Android/data/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/a/d/a/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static a(Landroid/content/Context;Lnet/youmi/android/a/a/d/a/a;Lnet/youmi/android/a/a/d/a/a;IJ)Lnet/youmi/android/a/a/d/a/a;
    .locals 2

    packed-switch p3, :pswitch_data_0

    :cond_0
    :goto_0
    return-object p1

    :pswitch_0
    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/k/n;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move-object p1, p2

    goto :goto_0

    :pswitch_1
    invoke-static {p0, p4, p5}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    move-object p1, p2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static b()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "I176py7D"

    const-string v1, "4d480b14580d560751585c"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, ".cache"

    goto :goto_0
.end method
