.class final Lnet/youmi/android/a/a/i/a/d;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/i/a/b;

.field private b:J

.field private c:Landroid/view/animation/DecelerateInterpolator;


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/a/i/a/b;)V
    .locals 2

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/d;->a:Lnet/youmi/android/a/a/i/a/b;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnet/youmi/android/a/a/i/a/d;->b:J

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/i/a/d;->c:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/i/a/d;)J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/i/a/d;->b:J

    return-wide v0
.end method

.method static synthetic a(Lnet/youmi/android/a/a/i/a/d;J)J
    .locals 1

    iput-wide p1, p0, Lnet/youmi/android/a/a/i/a/d;->b:J

    return-wide p1
.end method

.method static synthetic b(Lnet/youmi/android/a/a/i/a/d;)Landroid/view/animation/DecelerateInterpolator;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/d;->c:Landroid/view/animation/DecelerateInterpolator;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/i/a/e;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/i/a/e;-><init>(Lnet/youmi/android/a/a/i/a/d;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    return-void
.end method
