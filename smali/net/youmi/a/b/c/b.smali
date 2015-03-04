.class public Lnet/youmi/android/a/b/c/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:[B

.field private c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;[BJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/b/c/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lnet/youmi/android/a/b/c/b;->b:[B

    iput-wide p3, p0, Lnet/youmi/android/a/b/c/b;->c:J

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/b;->b:[B

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/c/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/b/c/b;->c:J

    return-wide v0
.end method
