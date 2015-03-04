.class final Lnet/youmi/android/a/b/f/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/b/f/m;->b()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I

    const/4 v0, 0x0

    invoke-static {v0}, Lnet/youmi/android/a/b/f/m;->a(Z)Z

    return-void
.end method
