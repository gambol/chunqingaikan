.class public Lnet/youmi/android/a/a/g/a/g;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field private static d:I

.field private static e:Landroid/app/PendingIntent;

.field private static f:I

.field private static g:Landroid/app/PendingIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    sput v0, Lnet/youmi/android/a/a/g/a/g;->d:I

    sput v0, Lnet/youmi/android/a/a/g/a/g;->f:I

    invoke-static {}, Lnet/youmi/android/a/a/g/a/g;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/a/g;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/a/a/g/a/g;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/a/g;->b:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/a/a/g/a/g;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/a/g;->c:Ljava/lang/String;

    return-void
.end method

.method private static final a()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "a2U9dn73sdLs"

    const-string v1, "545c094f4959110f5e4b025d194a1555444c4c42590a585b5754"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->b(Landroid/content/Context;)V

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->c(Landroid/content/Context;)V

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->d(Landroid/content/Context;)V

    return-void
.end method

.method private static a(Landroid/content/Context;J)V
    .locals 7

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v6

    move-wide v4, p1

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;JJ)V
    .locals 1

    invoke-static {p0, p1, p2}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;J)V

    invoke-static {p0, p3, p4}, Lnet/youmi/android/a/a/g/a/g;->b(Landroid/content/Context;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V
    .locals 6

    const-wide/16 v2, 0x3e8

    const-wide/32 v4, 0x36ee80

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;JJ)V

    return-void
.end method

.method private static a(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;JJ)V
    .locals 0

    invoke-static {p0, p1}, Lnet/youmi/android/a/a/g/a/g;->b(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V

    invoke-static {p0, p2, p3, p4, p5}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;JJ)V

    return-void
.end method

.method private static final b()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "a2U9dn73sdLc"

    const-string v1, "0256584b1f5e435f0d1c50564c5b5e5645014c405c5f0f5b085f"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;J)V
    .locals 5

    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, p1

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->f(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnet/youmi/android/ExpService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lnet/youmi/android/a/a/g/a/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "AdData"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method private static final c()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "a2U9dn73sdLa"

    const-string v1, "555b5f1f185a10080a1b53551d59065d46534b5b1b4758095e5b5b53"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->f(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static d(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/b/d;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static e(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->e:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnet/youmi/android/ExpService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lnet/youmi/android/a/a/g/a/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->g(Landroid/content/Context;)I

    move-result v1

    const/high16 v2, 0x10000000

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/a/g;->e:Landroid/app/PendingIntent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->e:Landroid/app/PendingIntent;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static f(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->g:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnet/youmi/android/ExpService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v1, Lnet/youmi/android/a/a/g/a/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->h(Landroid/content/Context;)I

    move-result v1

    const/high16 v2, 0x10000000

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/a/g/a/g;->g:Landroid/app/PendingIntent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->g:Landroid/app/PendingIntent;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static g(Landroid/content/Context;)I
    .locals 5

    const/4 v4, -0x1

    sget v0, Lnet/youmi/android/a/a/g/a/g;->d:I

    if-ne v4, v0, :cond_1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sput v0, Lnet/youmi/android/a/a/g/a/g;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget v0, Lnet/youmi/android/a/a/g/a/g;->d:I

    if-ne v4, v0, :cond_1

    const/16 v0, 0x572a

    sput v0, Lnet/youmi/android/a/a/g/a/g;->d:I

    :cond_1
    sget v0, Lnet/youmi/android/a/a/g/a/g;->d:I

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static h(Landroid/content/Context;)I
    .locals 2

    const/4 v0, -0x1

    sget v1, Lnet/youmi/android/a/a/g/a/g;->f:I

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lnet/youmi/android/a/a/g/a/g;->g(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sput v0, Lnet/youmi/android/a/a/g/a/g;->f:I

    :cond_0
    sget v0, Lnet/youmi/android/a/a/g/a/g;->f:I

    return v0
.end method
