package com.tencent.open; class TaskGuide$h { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$h;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TaskGuide;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "h"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/String;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:[Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 717
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Lorg/json/JSONObject;)Lcom/tencent/open/TaskGuide$h;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/json/JSONException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 752
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 788
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$h;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 759
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v7, Lcom/tencent/open/TaskGuide$h;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/tencent/open/TaskGuide$h;);
a=0;//     invoke-direct {v7}, Lcom/tencent/open/TaskGuide$h;-><init>()V
a=0;// 
a=0;//     .line 760
a=0;//     #v7=(Reference,Lcom/tencent/open/TaskGuide$h;);
a=0;//     const-string v0, "task_info"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 761
a=0;//     const-string v1, "task_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v7, Lcom/tencent/open/TaskGuide$h;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 762
a=0;//     const-string v1, "task_desc"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v7, Lcom/tencent/open/TaskGuide$h;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 763
a=0;//     const-string v1, "step_info"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 764
a=0;//     #v9=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {v9}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 766
a=0;//     #v10=(Integer);
a=0;//     if-lez v10, :cond_1
a=0;// 
a=0;//     .line 767
a=0;//     new-array v0, v10, [Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     iput-object v0, v7, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     .line 770
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v8, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Integer);
a=0;//     if-ge v8, v10, :cond_2
a=0;// 
a=0;//     .line 771
a=0;//     invoke-virtual {v9, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 772
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "step_no"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 773
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "status"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 777
a=0;//     #v6=(Integer);
a=0;//     const-string v2, "step_desc"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 779
a=0;//     const-string v3, "step_gift"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 783
a=0;//     const-string v4, "end_time"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 785
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v0, Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/TaskGuide$g;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/TaskGuide$g;-><init>(ILjava/lang/String;Ljava/lang/String;JI)V
a=0;// 
a=0;//     .line 786
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$g;);
a=0;//     iget-object v1, v7, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/tencent/open/TaskGuide$g;);
a=0;//     aput-object v0, v1, v8
a=0;// 
a=0;//     .line 770
a=0;//     add-int/lit8 v0, v8, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v8, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 788
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide$h;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/tencent/open/TaskGuide$g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 728
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 730
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
