package com.lidroid.xutils.http; class HttpHandler$State { void a() { int a;
a=0;// .class public final enum Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// .super Ljava/lang/Enum;
a=0;// .source "HttpHandler.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/http/HttpHandler;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4019
a=0;//     name = "State"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Enum",
a=0;//         "<",
a=0;//         "Lcom/lidroid/xutils/http/HttpHandler$State;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final synthetic ENUM$VALUES:[Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum LOADING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum STARTED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum SUCCESS:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// .field public static final enum WAITING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private value:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 317
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "WAITING"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v4, v4}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->WAITING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "STARTED"
a=0;// 
a=0;//     invoke-direct {v0, v1, v5, v5}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STARTED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "LOADING"
a=0;// 
a=0;//     invoke-direct {v0, v1, v6, v6}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->LOADING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "FAILURE"
a=0;// 
a=0;//     invoke-direct {v0, v1, v7, v7}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "STOPPED"
a=0;// 
a=0;//     invoke-direct {v0, v1, v8, v8}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const-string v1, "SUCCESS"
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/lidroid/xutils/http/HttpHandler$State;-><init>(Ljava/lang/String;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->SUCCESS:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 316
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->WAITING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->STARTED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->LOADING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     aput-object v1, v0, v8
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/HttpHandler$State;->SUCCESS:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->ENUM$VALUES:[Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;II)V
a=0;//     .locals 1
a=0;//     .param p3, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 318
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/http/HttpHandler$State;->value:I
a=0;// 
a=0;//     .line 321
a=0;//     iput p3, p0, Lcom/lidroid/xutils/http/HttpHandler$State;->value:I
a=0;// 
a=0;//     .line 322
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(I)Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;//     .locals 1
a=0;//     .param p0, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 339
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 327
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->WAITING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 329
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STARTED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->LOADING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 333
a=0;//     :pswitch_3
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     :pswitch_4
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     :pswitch_5
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->SUCCESS:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static valueOf(Ljava/lang/String;)Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     const-class v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static values()[Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->ENUM$VALUES:[Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public value()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     iget v0, p0, Lcom/lidroid/xutils/http/HttpHandler$State;->value:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
