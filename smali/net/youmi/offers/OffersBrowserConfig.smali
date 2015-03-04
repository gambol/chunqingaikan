.class public Lnet/youmi/android/offers/OffersBrowserConfig;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:I

.field public static isUsingSdkPointsUnitApi:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lnet/youmi/android/offers/OffersBrowserConfig;->isUsingSdkPointsUnitApi:Z

    const-string v0, "#FFFFBB34"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lnet/youmi/android/offers/OffersBrowserConfig;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBrowserTitleBackgroundColor()I
    .locals 1

    sget v0, Lnet/youmi/android/offers/OffersBrowserConfig;->c:I

    return v0
.end method

.method public static getBrowserTitleText()Ljava/lang/String;
    .locals 1

    sget-object v0, Lnet/youmi/android/offers/OffersBrowserConfig;->a:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->H()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/OffersBrowserConfig;->a:Ljava/lang/String;

    goto :goto_0
.end method

.method public static getPointsUnit()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lnet/youmi/android/offers/OffersBrowserConfig;->b:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->I()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/OffersBrowserConfig;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public static setBrowserTitleBackgroundColor(I)V
    .locals 1

    sput p0, Lnet/youmi/android/offers/OffersBrowserConfig;->c:I

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/j/a/b;->a(I)V

    return-void
.end method

.method public static setBrowserTitleText(Ljava/lang/String;)V
    .locals 1

    sput-object p0, Lnet/youmi/android/offers/OffersBrowserConfig;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/j/a/b;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static setPointsUnit(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sput-object p0, Lnet/youmi/android/offers/OffersBrowserConfig;->b:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/a/j/a/b;->b(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
