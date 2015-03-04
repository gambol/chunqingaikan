.class public abstract Lnet/youmi/android/a/a/j/b/d;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lnet/youmi/android/a/a/j/b/b;


# instance fields
.field private a:Lnet/youmi/android/a/a/j/b/c;

.field private b:Lnet/youmi/android/a/a/j/b/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->a:Lnet/youmi/android/a/a/j/b/c;

    sget-object v0, Lnet/youmi/android/a/a/j/b/c;->a:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->b:Lnet/youmi/android/a/a/j/b/c;

    return-void
.end method

.method private final a(Lnet/youmi/android/a/a/j/b/c;Lnet/youmi/android/a/a/j/b/c;)V
    .locals 2

    sget-object v0, Lnet/youmi/android/a/a/j/b/e;->a:[I

    invoke-virtual {p1}, Lnet/youmi/android/a/a/j/b/c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/d;->a()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/d;->b()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/d;->c()V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/b/d;->d()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract b()V
.end method

.method protected abstract c()V
.end method

.method protected abstract d()V
.end method

.method protected getPreState()Lnet/youmi/android/a/a/j/b/c;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->b:Lnet/youmi/android/a/a/j/b/c;

    return-object v0
.end method

.method public getState()Lnet/youmi/android/a/a/j/b/c;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->a:Lnet/youmi/android/a/a/j/b/c;

    return-object v0
.end method

.method public setState(Lnet/youmi/android/a/a/j/b/c;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->a:Lnet/youmi/android/a/a/j/b/c;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->a:Lnet/youmi/android/a/a/j/b/c;

    iput-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->b:Lnet/youmi/android/a/a/j/b/c;

    iput-object p1, p0, Lnet/youmi/android/a/a/j/b/d;->a:Lnet/youmi/android/a/a/j/b/c;

    iget-object v0, p0, Lnet/youmi/android/a/a/j/b/d;->b:Lnet/youmi/android/a/a/j/b/c;

    invoke-direct {p0, p1, v0}, Lnet/youmi/android/a/a/j/b/d;->a(Lnet/youmi/android/a/a/j/b/c;Lnet/youmi/android/a/a/j/b/c;)V

    :cond_0
    return-void
.end method
