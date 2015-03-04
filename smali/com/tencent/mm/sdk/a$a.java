package com.tencent.mm.sdk; class a$a { void a() { int a;
a=0;// .class final Lcom/tencent/mm/sdk/a$a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/mm/sdk/a;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/ContentResolver;
a=0;// 
a=0;// .field private e:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private f:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/ContentResolver;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/a$a;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/mm/sdk/a$a;->g:Z
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/a$a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final apply()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final clear()Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/mm/sdk/a$a;->g:Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final commit()Z
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v4, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ContentValues;);
a=0;//     iget-boolean v0, p0, Lcom/tencent/mm/sdk/a$a;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     sget-object v1, Lcom/tencent/mm/sdk/c/a$b;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1, v5, v5}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/tencent/mm/sdk/a$a;->g:Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v5=(Reference,Landroid/content/ContentResolver;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/mm/sdk/a$a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     sget-object v6, Lcom/tencent/mm/sdk/c/a$b;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     #v6=(Reference,Landroid/net/Uri;);
a=0;//     const-string v7, "key = ?"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-array v8, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     aput-object v0, v8, v2
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7, v8}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.PluginProvider.Resolver"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "unresolve failed, null value"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v7}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(PosByte);v7=(Conflicted);
a=0;//     if-nez v1, :cond_a
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/a$a;->a:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentResolver;);
a=0;//     sget-object v6, Lcom/tencent/mm/sdk/c/a$b;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     const-string v7, "key = ?"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-array v8, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v8, v2
a=0;// 
a=0;//     invoke-virtual {v1, v6, v4, v7, v8}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     instance-of v1, v6, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v6, Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v6, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v6, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v6, Ljava/lang/Float;
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);
a=0;//     instance-of v1, v6, Ljava/lang/Double;
a=0;// 
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "MicroMsg.SDK.PluginProvider.Resolver"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "unresolve failed, unknown type="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(PosByte);v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, "type"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v4, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     const-string v1, "value"
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v1, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public final putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Float;);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->e:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Landroid/content/SharedPreferences$Editor;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/a$a;->f:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     return-object p0
a=0;// .end method
}}
