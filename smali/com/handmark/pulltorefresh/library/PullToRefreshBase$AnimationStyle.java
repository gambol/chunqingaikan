package com.handmark.pulltorefresh.library; class PullToRefreshBase$AnimationStyle { void a() { int a;
a=0;// .class public final enum Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "PullToRefreshBase.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "AnimationStyle"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$AnimationStyle:[I
a=0;// 
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;// .field public static final enum FLIP:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;// .field public static final enum ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$AnimationStyle()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1288
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$AnimationStyle:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->FLIP:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$AnimationStyle:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1289
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     const-string v1, "ROTATE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1293
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 1295
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     const-string v1, "FLIP"
a=0;// 
a=0;//     invoke-direct {v0, v1, v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1299
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->FLIP:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 1288
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->FLIP:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1288
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getDefault()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1302
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static mapIntToValue(I)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;//     .locals 1
a=0;//     .param p0, "modeInt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1314
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 1317
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ROTATE:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     .line 1319
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->FLIP:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1314
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ENUM$VALUES:[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method createLoadingLayout(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p4, "attrs"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1324
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "scrollDirection":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;"
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$AnimationStyle()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1327
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;);
a=0;//     invoke-direct {v0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     .line 1329
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;);
a=0;//     invoke-direct {v0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1324
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
