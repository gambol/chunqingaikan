.class public final Lnet/youmi/android/a/a/d/a/b;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/a/a/d/a/a;

.field private static b:Lnet/youmi/android/a/a/d/a/a;

.field private static c:Lnet/youmi/android/a/a/d/a/a;

.field private static d:Lnet/youmi/android/a/a/d/a/a;

.field private static e:Lnet/youmi/android/a/a/d/a/a;


# direct methods
.method public static a(Landroid/content/Context;)Lnet/youmi/android/a/a/d/a/a;
    .locals 6

    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->d:Lnet/youmi/android/a/a/d/a/a;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v0, Lnet/youmi/android/a/a/d/a/a;

    const-wide/16 v2, -0x1

    const-wide/16 v4, -0x1

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;-><init>(Ljava/io/File;JJ)V

    sput-object v0, Lnet/youmi/android/a/a/d/a/b;->d:Lnet/youmi/android/a/a/d/a/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->d:Lnet/youmi/android/a/a/d/a/a;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;
    .locals 6

    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->c:Lnet/youmi/android/a/a/d/a/a;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/d/a/a;

    const-string v1, ".C2655DBDD5C7328BA5EF149B2A8261A0"

    invoke-static {v1}, Lnet/youmi/android/a/a/d/a/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-wide/32 v2, 0x6400000

    const-wide v4, 0x9a7ec800L

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;-><init>(Ljava/io/File;JJ)V

    sput-object v0, Lnet/youmi/android/a/a/d/a/b;->c:Lnet/youmi/android/a/a/d/a/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v1, Lnet/youmi/android/a/a/d/a/b;->c:Lnet/youmi/android/a/a/d/a/a;

    invoke-static {p0}, Lnet/youmi/android/a/a/d/a/b;->b(Landroid/content/Context;)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v2

    const-wide/32 v4, 0xa00000

    move-object v0, p0

    move v3, p1

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/d/a/a;Lnet/youmi/android/a/a/d/a/a;IJ)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Lnet/youmi/android/a/a/d/a/a;
    .locals 6

    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->e:Lnet/youmi/android/a/a/d/a/a;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    new-instance v0, Lnet/youmi/android/a/a/d/a/a;

    const-wide/16 v2, -0x1

    const-wide/16 v4, -0x1

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;-><init>(Ljava/io/File;JJ)V

    sput-object v0, Lnet/youmi/android/a/a/d/a/b;->e:Lnet/youmi/android/a/a/d/a/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->e:Lnet/youmi/android/a/a/d/a/a;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;
    .locals 6

    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->a:Lnet/youmi/android/a/a/d/a/a;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/d/a/a;

    const-string v1, ".ECDF5D7F3EB26A54256D1994F72EEB4D"

    invoke-static {v1}, Lnet/youmi/android/a/a/d/a/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-wide/32 v2, 0x12c00000

    const-wide/32 v4, 0x4d3f6400

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;-><init>(Ljava/io/File;JJ)V

    sput-object v0, Lnet/youmi/android/a/a/d/a/b;->a:Lnet/youmi/android/a/a/d/a/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v1, Lnet/youmi/android/a/a/d/a/b;->a:Lnet/youmi/android/a/a/d/a/a;

    invoke-static {p0}, Lnet/youmi/android/a/a/d/a/b;->b(Landroid/content/Context;)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v2

    const-wide/32 v4, 0x6400000

    move-object v0, p0

    move v3, p1

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/d/a/a;Lnet/youmi/android/a/a/d/a/a;IJ)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;I)Lnet/youmi/android/a/a/d/a/a;
    .locals 6

    sget-object v0, Lnet/youmi/android/a/a/d/a/b;->b:Lnet/youmi/android/a/a/d/a/a;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/d/a/a;

    const-string v1, ".CCFFFA1D25C44B08BC24C3C6D8D6666F"

    invoke-static {v1}, Lnet/youmi/android/a/a/d/a/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-wide/32 v2, 0x12c00000

    const-wide/32 v4, 0x19bfcc00

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;-><init>(Ljava/io/File;JJ)V

    sput-object v0, Lnet/youmi/android/a/a/d/a/b;->b:Lnet/youmi/android/a/a/d/a/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v1, Lnet/youmi/android/a/a/d/a/b;->b:Lnet/youmi/android/a/a/d/a/a;

    invoke-static {p0}, Lnet/youmi/android/a/a/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v2

    const-wide/32 v4, 0x6400000

    move-object v0, p0

    move v3, p1

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/a/d/a/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/d/a/a;Lnet/youmi/android/a/a/d/a/a;IJ)Lnet/youmi/android/a/a/d/a/a;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
