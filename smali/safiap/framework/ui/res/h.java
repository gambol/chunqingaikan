package safiap.framework.ui.res; class h { void a() { int a;
a=0;// .class public final Lsafiap/framework/ui/res/h;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:I = 0x320
a=0;// 
a=0;// .field private static final b:I = 0x1e0
a=0;// 
a=0;// .field private static c:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const-string v0, "SafRes"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/ui/res/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/view/WindowManager;ILandroid/content/res/Configuration;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget v0, p2, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     mul-int/2addr v0, p1
a=0;// 
a=0;//     div-int/lit16 v0, v0, 0x320
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     mul-int/2addr v0, p1
a=0;// 
a=0;//     div-int/lit16 v0, v0, 0x1e0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a([[I[I)Landroid/graphics/drawable/StateListDrawable;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 34
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/StateListDrawable;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Landroid/graphics/drawable/StateListDrawable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Reference,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v2, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     aget v3, p1, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
a=0;// 
a=0;//     .line 32
a=0;//     #v2=(Reference,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     aget-object v3, p0, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 30
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 34
a=0;//     #v0=(Reference,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
