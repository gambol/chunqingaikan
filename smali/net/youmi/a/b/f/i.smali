.class public Lnet/youmi/android/a/b/f/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field a:Lnet/youmi/android/a/b/f/j;

.field final synthetic b:Lnet/youmi/android/a/b/f/g;


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/b/f/g;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/f/i;->b:Lnet/youmi/android/a/b/f/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/b/f/f;ILnet/youmi/android/a/b/f/b;)V
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/i;->a:Lnet/youmi/android/a/b/f/j;

    invoke-virtual {v0, p1, p3}, Lnet/youmi/android/a/b/f/j;->a(Lnet/youmi/android/a/b/f/f;Lnet/youmi/android/a/b/f/b;)V

    invoke-virtual {p1, v1}, Lnet/youmi/android/a/b/f/f;->b(I)V

    invoke-virtual {p1, v1}, Lnet/youmi/android/a/b/f/f;->b(I)V

    if-nez p2, :cond_0

    :cond_0
    return-void
.end method
