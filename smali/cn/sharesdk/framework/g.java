package cn.sharesdk.framework; class g { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final ADDRESS:Ljava/lang/String; = "address"
a=0;// 
a=0;// .field protected static final AUTHOR:Ljava/lang/String; = "author"
a=0;// 
a=0;// .field protected static final COMMENT:Ljava/lang/String; = "comment"
a=0;// 
a=0;// .field protected static final CONTENT_TYPE:Ljava/lang/String; = "contentType"
a=0;// 
a=0;// .field protected static final CUSTOM_FLAG:Ljava/lang/String; = "customFlag"
a=0;// 
a=0;// .field protected static final EXECUTE_URL:Ljava/lang/String; = "executeUrl"
a=0;// 
a=0;// .field protected static final EXT_INFO:Ljava/lang/String; = "extInfo"
a=0;// 
a=0;// .field protected static final FILE_PATH:Ljava/lang/String; = "filePath"
a=0;// 
a=0;// .field protected static final GROPU_ID:Ljava/lang/String; = "gropuId"
a=0;// 
a=0;// .field protected static final HIDDEN:Ljava/lang/String; = "hidden"
a=0;// 
a=0;// .field protected static final IMAGE_DATA:Ljava/lang/String; = "imageData"
a=0;// 
a=0;// .field protected static final IMAGE_PATH:Ljava/lang/String; = "imagePath"
a=0;// 
a=0;// .field protected static final IMAGE_URL:Ljava/lang/String; = "imageUrl"
a=0;// 
a=0;// .field protected static final INSTALL_URL:Ljava/lang/String; = "installUrl"
a=0;// 
a=0;// .field protected static final IS_FAMILY:Ljava/lang/String; = "isFamily"
a=0;// 
a=0;// .field protected static final IS_FRIEND:Ljava/lang/String; = "isFriend"
a=0;// 
a=0;// .field protected static final IS_PUBLIC:Ljava/lang/String; = "isPublic"
a=0;// 
a=0;// .field protected static final IS_SHARE_TENCENT_WEIBO:Ljava/lang/String; = "isShareTencentWeibo"
a=0;// 
a=0;// .field protected static final LATITUDE:Ljava/lang/String; = "latitude"
a=0;// 
a=0;// .field protected static final LONGITUDE:Ljava/lang/String; = "longitude"
a=0;// 
a=0;// .field protected static final MUSIC_URL:Ljava/lang/String; = "musicUrl"
a=0;// 
a=0;// .field protected static final NOTEBOOK:Ljava/lang/String; = "notebook"
a=0;// 
a=0;// .field protected static final SAFETY_LEVEL:Ljava/lang/String; = "safetyLevel"
a=0;// 
a=0;// .field protected static final SCENCE:Ljava/lang/String; = "scene"
a=0;// 
a=0;// .field protected static final SHARE_TYPE:Ljava/lang/String; = "shareType"
a=0;// 
a=0;// .field protected static final SITE:Ljava/lang/String; = "site"
a=0;// 
a=0;// .field protected static final SITE_URL:Ljava/lang/String; = "siteUrl"
a=0;// 
a=0;// .field protected static final STACK:Ljava/lang/String; = "stack"
a=0;// 
a=0;// .field protected static final TAGS:Ljava/lang/String; = "tags"
a=0;// 
a=0;// .field protected static final TEXT:Ljava/lang/String; = "text"
a=0;// 
a=0;// .field protected static final TITLE:Ljava/lang/String; = "title"
a=0;// 
a=0;// .field protected static final TITLE_URL:Ljava/lang/String; = "titleUrl"
a=0;// 
a=0;// .field protected static final URL:Ljava/lang/String; = "url"
a=0;// 
a=0;// .field protected static final VENUE_DESCRIPTION:Ljava/lang/String; = "venueDescription"
a=0;// 
a=0;// .field protected static final VENUE_NAME:Ljava/lang/String; = "venueName"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private params:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/g;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/g;-><init>(Ljava/util/HashMap;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/HashMap;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/g;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/g;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);
a=0;//     const-class v0, Ljava/lang/Byte;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/lang/Byte;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Byte;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Byte;-><init>(B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Byte;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/lang/Short;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     new-instance v0, Ljava/lang/Short;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Short;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Short;-><init>(S)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Short;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     new-instance v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Integer;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     new-instance v0, Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Long;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);
a=0;//     const-class v0, Ljava/lang/Float;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     :cond_9
a=0;//     new-instance v0, Ljava/lang/Float;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Float;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/lang/Double;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     :cond_b
a=0;//     new-instance v0, Ljava/lang/Double;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Double;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Double;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);
a=0;//     const-class v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     :cond_d
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAddress()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "address"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAuthor()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "author"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getComment()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "comment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentType()I
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "contentType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomFlag()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "customFlag"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExecuteUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "executeUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtInfo()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "extInfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilePath()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "filePath"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroupId()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "gropuId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHidden()I
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "hidden"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getImageData()Landroid/graphics/Bitmap;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "imageData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getImagePath()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "imagePath"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getImageUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "imageUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInstallUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "installUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLatitude()F
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "latitude"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLongitude()F
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "longitude"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMusicUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "musicUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNotebook()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "notebook"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSafetyLevel()I
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "safetyLevel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScence()I
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "scene"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getShareType()I
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "shareType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSite()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "site"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSiteUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "siteUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStack()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "stack"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTags()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "tags"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "text"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitleUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "titleUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUrl()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getVenueDescription()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "venueDescription"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getVenueName()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "venueName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isFamily()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isFamily"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isFriend()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isFriend"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isPublic()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isPublic"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShareTencentWeibo()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isShareTencentWeibo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAddress(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "address"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAuthor(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "author"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setComment(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "comment"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentType(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "contentType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomFlag([Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "customFlag"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExecuteUrl()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "executeUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExtInfo(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "extInfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFamily(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isFamily"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFilePath(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "filePath"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFriend(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isFriend"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupId(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "gropuId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHidden(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "hidden"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageData(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "imageData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImagePath(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "imagePath"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImageUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "imageUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInstallUrl()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "installUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-class v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLatitude(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "latitude"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLongitude(F)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "longitude"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMusicUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "musicUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNotebook(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "notebook"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPublic(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isPublic"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSafetyLevel(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "safetyLevel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScence(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "scene"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareTencentWeibo(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "isShareTencentWeibo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareType(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "shareType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSite(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "site"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSiteUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "siteUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStack(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "stack"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTags([Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "tags"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setText(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "text"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitleUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "titleUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUrl(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVenueDescription(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "venueDescription"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVenueName(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "venueName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/sharesdk/framework/g;->set(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toMap()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/g;->params:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
