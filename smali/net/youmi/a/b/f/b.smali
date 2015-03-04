.class public Lnet/youmi/android/a/b/f/b;
.super Ljava/lang/Object;


# instance fields
.field private a:[Lnet/youmi/android/a/b/f/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    new-array v0, v0, [Lnet/youmi/android/a/b/f/d;

    iput-object v0, p0, Lnet/youmi/android/a/b/f/b;->a:[Lnet/youmi/android/a/b/f/d;

    return-void
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/b/f/j;)I
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x11

    const/4 v1, -0x1

    iget-object v2, p0, Lnet/youmi/android/a/b/f/b;->a:[Lnet/youmi/android/a/b/f/d;

    aget-object v0, v2, v0

    move-object v3, v0

    move v0, v1

    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, v1, Lnet/youmi/android/a/b/f/d;->a:Lnet/youmi/android/a/b/f/j;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v0, v1, Lnet/youmi/android/a/b/f/d;->b:I

    :cond_0
    iget-object v1, v1, Lnet/youmi/android/a/b/f/d;->c:Lnet/youmi/android/a/b/f/d;

    goto :goto_0

    :cond_1
    return v0
.end method

.method public a(ILnet/youmi/android/a/b/f/j;)V
    .locals 3

    const/16 v0, 0x3fff

    if-le p1, v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x11

    new-instance v1, Lnet/youmi/android/a/b/f/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lnet/youmi/android/a/b/f/d;-><init>(Lnet/youmi/android/a/b/f/c;)V

    iput-object p2, v1, Lnet/youmi/android/a/b/f/d;->a:Lnet/youmi/android/a/b/f/j;

    iput p1, v1, Lnet/youmi/android/a/b/f/d;->b:I

    iget-object v2, p0, Lnet/youmi/android/a/b/f/b;->a:[Lnet/youmi/android/a/b/f/d;

    aget-object v2, v2, v0

    iput-object v2, v1, Lnet/youmi/android/a/b/f/d;->c:Lnet/youmi/android/a/b/f/d;

    iget-object v2, p0, Lnet/youmi/android/a/b/f/b;->a:[Lnet/youmi/android/a/b/f/d;

    aput-object v1, v2, v0

    goto :goto_0
.end method
