package com.tencent.mm.sdk; class a { void a() { int a;
a=0;// .class public final Lcom/tencent/mm/sdk/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/SharedPreferences;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/mm/sdk/a$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Landroid/content/ContentResolver;
a=0;// 
a=0;// .field private final b:[Ljava/lang/String;
a=0;// 
a=0;// .field private final c:Ljava/util/HashMap;
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
a=0;// .field private d:Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/a;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "_id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "key"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "type"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v2, "value"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a;->b:[Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a;->d:Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     sget-object v1, Lcom/tencent/mm/sdk/c/a$b;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/a;->b:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const-string v3, "key = ?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/database/Cursor;);v2=(Reference,[Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,[Ljava/lang/String;);v5=(Null);
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "value"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/mm/sdk/c/a$a;->a(ILjava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/database/Cursor;);v2=(Integer);v3=(Boolean);v4=(Reference,[Ljava/lang/String;);v5=(Null);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final contains(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final edit()Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->d:Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/a$a;);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/mm/sdk/a$a;-><init>(Landroid/content/ContentResolver;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a$a;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a;->d:Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->d:Lcom/tencent/mm/sdk/a$a;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getAll()Ljava/util/Map;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     sget-object v1, Lcom/tencent/mm/sdk/c/a$b;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/a;->b:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/net/Uri;);v2=(Reference,[Ljava/lang/String;);v3=(Null);v4=(Null);v5=(Null);v6=(Null);
a=0;//     const-string v1, "key"
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "type"
a=0;// 
a=0;//     invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "value"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Reference,Ljava/lang/Object;);v5=(Reference,Ljava/util/HashMap;);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/tencent/mm/sdk/c/a$a;->a(ILjava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/tencent/mm/sdk/a;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->c:Ljava/util/HashMap;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Integer);v3=(Integer);v4=(Boolean);v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a;->c:Ljava/util/HashMap;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getBoolean(Ljava/lang/String;Z)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return p2
a=0;// .end method
a=0;// 
a=0;// .method public final getFloat(Ljava/lang/String;F)F
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Ljava/lang/Float;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return p2
a=0;// .end method
a=0;// 
a=0;// .method public final getInt(Ljava/lang/String;I)I
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return p2
a=0;// .end method
a=0;// 
a=0;// .method public final getLong(Ljava/lang/String;J)J
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Ljava/lang/Long;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-wide p2
a=0;// .end method
a=0;// 
a=0;// .method public final getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/mm/sdk/a;->getValue(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, p2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
