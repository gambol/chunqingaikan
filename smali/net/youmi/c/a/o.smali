.class public final enum Lnet/youmi/android/c/a/o;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lnet/youmi/android/c/a/o;

.field public static final enum b:Lnet/youmi/android/c/a/o;

.field public static final enum c:Lnet/youmi/android/c/a/o;

.field private static final synthetic e:[Lnet/youmi/android/c/a/o;


# instance fields
.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lnet/youmi/android/c/a/o;

    const-string v1, "WAIT_FINISH"

    invoke-direct {v0, v1, v2, v2}, Lnet/youmi/android/c/a/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/youmi/android/c/a/o;->a:Lnet/youmi/android/c/a/o;

    new-instance v0, Lnet/youmi/android/c/a/o;

    const-string v1, "SYNC_DECODER"

    invoke-direct {v0, v1, v3, v3}, Lnet/youmi/android/c/a/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/youmi/android/c/a/o;->b:Lnet/youmi/android/c/a/o;

    new-instance v0, Lnet/youmi/android/c/a/o;

    const-string v1, "COVER"

    invoke-direct {v0, v1, v4, v4}, Lnet/youmi/android/c/a/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/youmi/android/c/a/o;->c:Lnet/youmi/android/c/a/o;

    const/4 v0, 0x3

    new-array v0, v0, [Lnet/youmi/android/c/a/o;

    sget-object v1, Lnet/youmi/android/c/a/o;->a:Lnet/youmi/android/c/a/o;

    aput-object v1, v0, v2

    sget-object v1, Lnet/youmi/android/c/a/o;->b:Lnet/youmi/android/c/a/o;

    aput-object v1, v0, v3

    sget-object v1, Lnet/youmi/android/c/a/o;->c:Lnet/youmi/android/c/a/o;

    aput-object v1, v0, v4

    sput-object v0, Lnet/youmi/android/c/a/o;->e:[Lnet/youmi/android/c/a/o;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnet/youmi/android/c/a/o;->d:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/youmi/android/c/a/o;
    .locals 1

    const-class v0, Lnet/youmi/android/c/a/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/c/a/o;

    return-object v0
.end method

.method public static values()[Lnet/youmi/android/c/a/o;
    .locals 1

    sget-object v0, Lnet/youmi/android/c/a/o;->e:[Lnet/youmi/android/c/a/o;

    invoke-virtual {v0}, [Lnet/youmi/android/c/a/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/youmi/android/c/a/o;

    return-object v0
.end method
