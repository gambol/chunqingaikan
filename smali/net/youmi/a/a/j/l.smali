.class public Lnet/youmi/android/a/a/j/l;
.super Ljava/lang/Object;


# instance fields
.field private a:Lnet/youmi/android/a/b/l/e;

.field private b:Landroid/view/animation/Animation;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/view/View;ILandroid/view/animation/Animation;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/b/l/e;

    invoke-direct {v0, p1, p2, p3}, Lnet/youmi/android/a/b/l/e;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    iput-object v0, p0, Lnet/youmi/android/a/a/j/l;->a:Lnet/youmi/android/a/b/l/e;

    iput-object p4, p0, Lnet/youmi/android/a/a/j/l;->b:Landroid/view/animation/Animation;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/view/View;I)Lnet/youmi/android/a/a/j/l;
    .locals 4

    new-instance v0, Lnet/youmi/android/a/a/j/l;

    const/16 v1, 0x11

    const/16 v2, 0x1a4

    const/16 v3, 0xe6

    invoke-static {p0, v2, p2, v3}, Lnet/youmi/android/a/b/a/a;->a(Landroid/content/Context;III)Landroid/view/animation/AnimationSet;

    move-result-object v2

    invoke-direct {v0, p0, p1, v1, v2}, Lnet/youmi/android/a/a/j/l;-><init>(Landroid/content/Context;Landroid/view/View;ILandroid/view/animation/Animation;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/l;->a:Lnet/youmi/android/a/b/l/e;

    iget-object v1, p0, Lnet/youmi/android/a/a/j/l;->b:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/l/e;->a(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
