.class public Lnet/youmi/android/a/b/f/f;
.super Ljava/lang/Object;


# instance fields
.field private a:[B

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, p1, [B

    iput-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lnet/youmi/android/a/b/f/f;->c:I

    return-void
.end method

.method private a(JI)V
    .locals 5

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p3

    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " out of range for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bit value"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private c(I)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    array-length v0, v0

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/2addr v1, p1

    if-ge v0, v1, :cond_1

    iget v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/2addr v0, p1

    :cond_1
    new-array v0, v0, [B

    iget-object v1, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v2, p0, Lnet/youmi/android/a/b/f/f;->b:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    return v0
.end method

.method public a(I)V
    .locals 3

    int-to-long v0, p1

    const/16 v2, 0x8

    invoke-direct {p0, v0, v1, v2}, Lnet/youmi/android/a/b/f/f;->a(JI)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/f;->c(I)V

    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/youmi/android/a/b/f/f;->b:I

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-void
.end method

.method public a([BII)V
    .locals 2

    invoke-direct {p0, p3}, Lnet/youmi/android/a/b/f/f;->c(I)V

    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/2addr v0, p3

    iput v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    return-void
.end method

.method public b(I)V
    .locals 3

    int-to-long v0, p1

    const/16 v2, 0x10

    invoke-direct {p0, v0, v1, v2}, Lnet/youmi/android/a/b/f/f;->a(JI)V

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/f;->c(I)V

    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/youmi/android/a/b/f/f;->b:I

    ushr-int/lit8 v2, p1, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v1, p0, Lnet/youmi/android/a/b/f/f;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/youmi/android/a/b/f/f;->b:I

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-void
.end method

.method public b()[B
    .locals 4

    const/4 v3, 0x0

    iget v0, p0, Lnet/youmi/android/a/b/f/f;->b:I

    new-array v0, v0, [B

    iget-object v1, p0, Lnet/youmi/android/a/b/f/f;->a:[B

    iget v2, p0, Lnet/youmi/android/a/b/f/f;->b:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
