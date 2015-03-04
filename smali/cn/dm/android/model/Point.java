package cn.dm.android.model; class Point { void a() { int a;
a=0;// .class public Lcn/dm/android/model/Point;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/model/Point$PointStatus;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public consumed:I
a=0;// 
a=0;// .field public point:I
a=0;// 
a=0;// .field public status:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/model/Point;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/model/Point;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcn/dm/android/model/Point;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(I)Lcn/dm/android/model/Point$PointStatus;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 73
a=0;//     sget-object v0, Lcn/dm/android/model/Point$PointStatus;->unknown_error:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 67
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcn/dm/android/model/Point$PointStatus;->consume_success:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcn/dm/android/model/Point$PointStatus;->lack_point:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcn/dm/android/model/Point$PointStatus;->repeat_order:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static parser(Ljava/lang/String;)Lcn/dm/android/model/Point;
a=0;//     .locals 4
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v1=(Null);
a=0;//     sget-object v0, Lcn/dm/android/model/Point;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Point parser:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     :try_start_0
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "point"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcn/dm/android/model/Point;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/model/Point;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/model/Point;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point;);
a=0;//     const-string v3, "status"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Lcn/dm/android/model/Point;->a(I)Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/model/Point$PointStatus;);
a=0;//     iput-object v3, v0, Lcn/dm/android/model/Point;->status:Lcn/dm/android/model/Point$PointStatus;
a=0;// 
a=0;//     .line 54
a=0;//     const-string v3, "point"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Lcn/dm/android/model/Point;->point:I
a=0;// 
a=0;//     .line 55
a=0;//     const-string v3, "consumed"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Lcn/dm/android/model/Point;->consumed:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 57
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
