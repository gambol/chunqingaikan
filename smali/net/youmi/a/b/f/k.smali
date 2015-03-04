.class public Lnet/youmi/android/a/b/f/k;
.super Ljava/lang/Object;


# static fields
.field private static d:Lnet/youmi/android/a/b/f/k;


# instance fields
.field private a:[Ljava/lang/String;

.field private b:[Lnet/youmi/android/a/b/f/j;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lnet/youmi/android/a/b/f/k;->c()V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/k;->b:[Lnet/youmi/android/a/b/f/j;

    iput v2, p0, Lnet/youmi/android/a/b/f/k;->c:I

    invoke-direct {p0}, Lnet/youmi/android/a/b/f/k;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lnet/youmi/android/a/b/f/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->b:[Lnet/youmi/android/a/b/f/j;

    if-nez v0, :cond_0

    :cond_2
    const-string v0, "os.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "java.vendor"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v2, :cond_0

    invoke-direct {p0}, Lnet/youmi/android/a/b/f/k;->f()V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->b:[Lnet/youmi/android/a/b/f/j;

    if-nez v0, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-array v0, v1, [Lnet/youmi/android/a/b/f/j;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/youmi/android/a/b/f/j;

    check-cast v0, [Lnet/youmi/android/a/b/f/j;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/k;->b:[Lnet/youmi/android/a/b/f/j;

    :cond_1
    return-void
.end method

.method public static declared-synchronized b()Lnet/youmi/android/a/b/f/k;
    .locals 2

    const-class v0, Lnet/youmi/android/a/b/f/k;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnet/youmi/android/a/b/f/k;->d:Lnet/youmi/android/a/b/f/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private b(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    invoke-static {p1, v0}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public static c()V
    .locals 2

    new-instance v0, Lnet/youmi/android/a/b/f/k;

    invoke-direct {v0}, Lnet/youmi/android/a/b/f/k;-><init>()V

    const-class v1, Lnet/youmi/android/a/b/f/k;

    monitor-enter v1

    :try_start_0
    sput-object v0, Lnet/youmi/android/a/b/f/k;->d:Lnet/youmi/android/a/b/f/k;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private d()Z
    .locals 6

    const/4 v0, 0x0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const-string v3, "dns.server"

    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Ljava/util/StringTokenizer;

    const-string v5, ","

    invoke-direct {v4, v3, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v1}, Lnet/youmi/android/a/b/f/k;->a(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const-string v3, "dns.search"

    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Ljava/util/StringTokenizer;

    const-string v5, ","

    invoke-direct {v4, v3, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v2}, Lnet/youmi/android/a/b/f/k;->b(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0, v1, v2}, Lnet/youmi/android/a/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V

    iget-object v1, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnet/youmi/android/a/b/f/k;->b:[Lnet/youmi/android/a/b/f/j;

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method private e()Z
    .locals 9

    const/4 v2, 0x0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    const-string v0, "sun.net.dns.ResolverConfiguration"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v0, "open"

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v0, "nameservers"

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const-string v8, "searchlist"

    invoke-virtual {v6, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_0

    move v0, v2

    :goto_0
    return v0

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0, v3}, Lnet/youmi/android/a/b/f/k;->a(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0, v4}, Lnet/youmi/android/a/b/f/k;->b(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_2

    :cond_2
    invoke-direct {p0, v3, v4}, Lnet/youmi/android/a/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private f()V
    .locals 8

    const/4 v0, 0x0

    const-string v1, "^\\d+(\\.\\d+){3}$"

    const-string v1, "^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$"

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    const-string v1, "android.os.SystemProperties"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v4, "get"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v1, 0x4

    new-array v5, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v6, "net.dns1"

    aput-object v6, v5, v1

    const/4 v1, 0x1

    const-string v6, "net.dns2"

    aput-object v6, v5, v1

    const/4 v1, 0x2

    const-string v6, "net.dns3"

    aput-object v6, v5, v1

    const/4 v1, 0x3

    const-string v6, "net.dns4"

    aput-object v6, v5, v1

    move v1, v0

    :goto_0
    array-length v0, v5

    if-ge v1, v0, :cond_2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aget-object v7, v5, v1

    aput-object v7, v0, v6

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v6, "^\\d+(\\.\\d+){3}$"

    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$"

    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_2
    invoke-direct {p0, v2, v3}, Lnet/youmi/android/a/b/f/k;->a(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/k;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0
.end method
