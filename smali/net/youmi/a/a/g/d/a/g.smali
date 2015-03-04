.class public Lnet/youmi/android/a/a/g/d/a/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/a/a/g/d/a/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/i;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/a/g/d/a/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/g;->a:Lnet/youmi/android/a/a/g/d/a/i;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/g;->a:Lnet/youmi/android/a/a/g/d/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/i;->a()V

    return-void
.end method
