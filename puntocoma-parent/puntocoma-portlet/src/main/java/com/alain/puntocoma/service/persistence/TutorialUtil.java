package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Tutorial;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tutorial service. This utility wraps {@link TutorialPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see TutorialPersistence
 * @see TutorialPersistenceImpl
 * @generated
 */
public class TutorialUtil {
    private static TutorialPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Tutorial tutorial) {
        getPersistence().clearCache(tutorial);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Tutorial> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Tutorial> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Tutorial> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Tutorial update(Tutorial tutorial) throws SystemException {
        return getPersistence().update(tutorial);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Tutorial update(Tutorial tutorial,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(tutorial, serviceContext);
    }

    /**
    * Returns all the tutorials where articleId = &#63;.
    *
    * @param articleId the article ID
    * @return the matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorderTutorial(articleId);
    }

    /**
    * Returns a range of all the tutorials where articleId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param articleId the article ID
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @return the range of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long articleId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorderTutorial(articleId, start, end);
    }

    /**
    * Returns an ordered range of all the tutorials where articleId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param articleId the article ID
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long articleId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderTutorial(articleId, start, end, orderByComparator);
    }

    /**
    * Returns the first tutorial in the ordered set where articleId = &#63;.
    *
    * @param articleId the article ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial findByorderTutorial_First(
        long articleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderTutorial_First(articleId, orderByComparator);
    }

    /**
    * Returns the first tutorial in the ordered set where articleId = &#63;.
    *
    * @param articleId the article ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching tutorial, or <code>null</code> if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial fetchByorderTutorial_First(
        long articleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorderTutorial_First(articleId, orderByComparator);
    }

    /**
    * Returns the last tutorial in the ordered set where articleId = &#63;.
    *
    * @param articleId the article ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial findByorderTutorial_Last(
        long articleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderTutorial_Last(articleId, orderByComparator);
    }

    /**
    * Returns the last tutorial in the ordered set where articleId = &#63;.
    *
    * @param articleId the article ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching tutorial, or <code>null</code> if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial fetchByorderTutorial_Last(
        long articleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorderTutorial_Last(articleId, orderByComparator);
    }

    /**
    * Removes all the tutorials where articleId = &#63; from the database.
    *
    * @param articleId the article ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByorderTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByorderTutorial(articleId);
    }

    /**
    * Returns the number of tutorials where articleId = &#63;.
    *
    * @param articleId the article ID
    * @return the number of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public static int countByorderTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByorderTutorial(articleId);
    }

    /**
    * Caches the tutorial in the entity cache if it is enabled.
    *
    * @param tutorial the tutorial
    */
    public static void cacheResult(com.alain.puntocoma.model.Tutorial tutorial) {
        getPersistence().cacheResult(tutorial);
    }

    /**
    * Caches the tutorials in the entity cache if it is enabled.
    *
    * @param tutorials the tutorials
    */
    public static void cacheResult(
        java.util.List<com.alain.puntocoma.model.Tutorial> tutorials) {
        getPersistence().cacheResult(tutorials);
    }

    /**
    * Creates a new tutorial with the primary key. Does not add the tutorial to the database.
    *
    * @param articleId the primary key for the new tutorial
    * @return the new tutorial
    */
    public static com.alain.puntocoma.model.Tutorial create(long articleId) {
        return getPersistence().create(articleId);
    }

    /**
    * Removes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial that was removed
    * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial remove(long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(articleId);
    }

    public static com.alain.puntocoma.model.Tutorial updateImpl(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(tutorial);
    }

    /**
    * Returns the tutorial with the primary key or throws a {@link com.alain.puntocoma.NoSuchTutorialException} if it could not be found.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial findByPrimaryKey(
        long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(articleId);
    }

    /**
    * Returns the tutorial with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial, or <code>null</code> if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial fetchByPrimaryKey(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(articleId);
    }

    /**
    * Returns all the tutorials.
    *
    * @return the tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the tutorials.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @return the range of tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the tutorials.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tutorials
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Tutorial> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tutorials from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tutorials.
    *
    * @return the number of tutorials
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TutorialPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TutorialPersistence) PortletBeanLocatorUtil.locate(com.alain.puntocoma.service.ClpSerializer.getServletContextName(),
                    TutorialPersistence.class.getName());

            ReferenceRegistry.registerReference(TutorialUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TutorialPersistence persistence) {
    }
}
