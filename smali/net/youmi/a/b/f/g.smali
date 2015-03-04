.class public Lnet/youmi/android/a/b/f/g;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Lnet/youmi/android/a/b/f/h;

.field private c:[Ljava/util/List;

.field private d:Lnet/youmi/android/a/b/f/i;

.field private e:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/util/List;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    new-instance v0, Lnet/youmi/android/a/b/f/h;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/b/f/h;-><init>(Lnet/youmi/android/a/b/f/g;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/f/g;->b:Lnet/youmi/android/a/b/f/h;

    invoke-static {p1}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;)Lnet/youmi/android/a/b/f/j;

    move-result-object v0

    sget-object v1, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/b/f/g;->a(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/b/f/i;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/b/f/i;-><init>(Lnet/youmi/android/a/b/f/g;)V

    iput-object v0, v1, Lnet/youmi/android/a/b/f/i;->a:Lnet/youmi/android/a/b/f/j;

    iput-object v1, p0, Lnet/youmi/android/a/b/f/g;->d:Lnet/youmi/android/a/b/f/i;

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/b/f/g;->a(Lnet/youmi/android/a/b/f/i;I)V

    return-void
.end method

.method constructor <init>(Lnet/youmi/android/a/b/f/e;)V
    .locals 6

    const/4 v5, 0x4

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, v5, [Ljava/util/List;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    new-instance v0, Lnet/youmi/android/a/b/f/h;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/a/b/f/h;-><init>(Lnet/youmi/android/a/b/f/g;Lnet/youmi/android/a/b/f/e;)V

    iput-object v0, p0, Lnet/youmi/android/a/b/f/g;->b:Lnet/youmi/android/a/b/f/h;

    move v2, v1

    :goto_0
    if-ge v2, v5, :cond_2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->b:Lnet/youmi/android/a/b/f/h;

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/f/h;->a(I)I

    move-result v3

    if-lez v3, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    aput-object v4, v0, v2

    :cond_0
    move v0, v1

    :goto_1
    if-ge v0, v3, :cond_1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->a()I

    invoke-virtual {p0, p1, v2}, Lnet/youmi/android/a/b/f/g;->a(Lnet/youmi/android/a/b/f/e;I)[B

    move-result-object v4

    if-eqz v4, :cond_3

    iput-object v4, p0, Lnet/youmi/android/a/b/f/g;->e:[B

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->e:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_4

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->a()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/f/g;->a:I

    return-void

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2
.end method

.method public constructor <init>([B)V
    .locals 1

    new-instance v0, Lnet/youmi/android/a/b/f/e;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/b/f/e;-><init>([B)V

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/g;-><init>(Lnet/youmi/android/a/b/f/e;)V

    return-void
.end method

.method private a(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    return-object p1

    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Lnet/youmi/android/a/b/f/j;->a(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object p1, v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/b/f/i;I)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    aget-object v0, v0, p2

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    aput-object v1, v0, p2

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->b:Lnet/youmi/android/a/b/f/h;

    invoke-virtual {v0, p2}, Lnet/youmi/android/a/b/f/h;->b(I)V

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    aget-object v0, v0, p2

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a()[B
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->e:[B

    return-object v0
.end method

.method a(Lnet/youmi/android/a/b/f/e;I)[B
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v1, p1}, Lnet/youmi/android/a/b/f/j;-><init>(Lnet/youmi/android/a/b/f/e;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->f()I

    move-result v1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->f()I

    if-nez p2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->g()J

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->f()I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/b/f/e;->b(I)[B

    move-result-object v0

    goto :goto_0

    :pswitch_2
    new-instance v1, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v1, p1}, Lnet/youmi/android/a/b/f/j;-><init>(Lnet/youmi/android/a/b/f/e;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public b()[B
    .locals 6

    const/4 v2, 0x0

    new-instance v4, Lnet/youmi/android/a/b/f/f;

    invoke-direct {v4}, Lnet/youmi/android/a/b/f/f;-><init>()V

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->b:Lnet/youmi/android/a/b/f/h;

    invoke-virtual {v0, v4}, Lnet/youmi/android/a/b/f/h;->a(Lnet/youmi/android/a/b/f/f;)V

    new-instance v5, Lnet/youmi/android/a/b/f/b;

    invoke-direct {v5}, Lnet/youmi/android/a/b/f/b;-><init>()V

    move v3, v2

    :goto_0
    const/4 v0, 0x4

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    aget-object v0, v0, v3

    if-nez v0, :cond_1

    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_1
    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    aget-object v0, v0, v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/g;->c:[Ljava/util/List;

    aget-object v0, v0, v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/f/i;

    invoke-virtual {v0, v4, v3, v5}, Lnet/youmi/android/a/b/f/i;->a(Lnet/youmi/android/a/b/f/f;ILnet/youmi/android/a/b/f/b;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Lnet/youmi/android/a/b/f/f;->a()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/f/g;->a:I

    invoke-virtual {v4}, Lnet/youmi/android/a/b/f/f;->b()[B

    move-result-object v0

    return-object v0
.end method
