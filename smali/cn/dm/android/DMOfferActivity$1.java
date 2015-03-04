package cn.dm.android; class DMOfferActivity$1 { void a() { int a;
a=0;// .class Lcn/dm/android/DMOfferActivity$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/DMOfferActivity;->c()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/DMOfferActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-object p1, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/32 v11, 0x5265c00
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-wide/16 v9, -0x1
a=0;// 
a=0;//     .line 95
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "_beginTime"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v9, v10}, Lcn/dm/android/b/b;->b(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v0, v2, v0
a=0;// 
a=0;//     cmp-long v0, v0, v11
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "tasking_packages"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/b/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/DMOfferActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Byte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 103
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 104
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     iget-object v1, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcn/dm/android/b/b;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "_beginTime"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5, v0, v9, v10}, Lcn/dm/android/b/b;->b(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 107
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     sub-long v5, v7, v5
a=0;// 
a=0;//     cmp-long v0, v5, v11
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     iget-object v5, p0, Lcn/dm/android/DMOfferActivity$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/DMOfferActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 109
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 110
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 111
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v2, v0, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 112
a=0;//     :cond_3
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ","
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aget-object v5, v3, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 117
a=0;//     :cond_4
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity$1;->b:Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "tasking_packages"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
